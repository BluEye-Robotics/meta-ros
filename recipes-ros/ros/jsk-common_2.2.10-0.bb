DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-tf-publisher image-view2 jsk-topic-tools jsk-tools multi-map-server virtual-force-publisher jsk-network-tools jsk-tilt-laser"

RDEPENDS_${PN} = "dynamic-tf-publisher image-view2 jsk-topic-tools jsk-tools multi-map-server virtual-force-publisher jsk-network-tools jsk-tilt-laser"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_common/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d786424b7cfe0c01382cc209915d12a4"
SRC_URI[sha256sum] = "f199dfa0fec8ff6d0e253344ab11deb511b0d1f300f4473845803b2a1c54db2f"

S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_common-2.2.10-0"

inherit catkin
