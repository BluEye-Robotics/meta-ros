DESCRIPTION = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "CLOSED"

inherit core-image

IMAGE_ROOTFS_EXTRA_SPACE = "524288"

# add own name to hosts
augment_hosts_setting_file () {
	echo '127.0.0.1\tqemux86-64.localdomain\t\tqemux86-64' >> ${IMAGE_ROOTFS}/etc/hosts
}

# installs the easy_install_pth_file that we need
create_python_easy_install_pth_file () {
	cat > ${IMAGE_ROOTFS}/usr/lib/python2.7/site-packages/easy-install.pth << EOF
import sys; sys.__plen = len(sys.path)
./setuptools-0.6c11-py2.7.egg
./rospkg-1.0.15-py2.7.egg
import sys; new=sys.path[sys.__plen:]; del sys.path[sys.__plen:]; p=getattr(sys,'__egginsert',0); sys.path[p:p]=new; sys.__egginsert = p+len(new)
EOF

}

# remove not needed ipkg informations
# create a custom hosts file
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; augment_hosts_setting_file ; create_python_easy_install_pth_file ; "

IMAGE_INSTALL += "boost boost-dev packagegroup-core-ssh-openssh dhcp-client file ldd python-modules python-setuptools python-rospkg python-rosinstall git cmake python-empy python-pyyaml python-nose log4cxx log4cxx-dev libbz2-dev ros"
