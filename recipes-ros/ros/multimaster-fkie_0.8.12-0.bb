DESCRIPTION = "The metapackage to combine the nodes required to establish and manage a multimaster network. This requires no or minimal configuration. The changes are automatically detected and synchronized."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multimaster-msgs-fkie default-cfg-fkie master-discovery-fkie master-sync-fkie node-manager-fkie"

RDEPENDS_${PN} = "multimaster-msgs-fkie default-cfg-fkie master-discovery-fkie master-sync-fkie node-manager-fkie"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/multimaster_fkie/0.8.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "82473640513e84a84a934ea8d4542e51"
SRC_URI[sha256sum] = "1119b4d51db09a0811ca344110f064d21037ada2c8b35f8535b7b6986b996356"

S = "${WORKDIR}/multimaster_fkie-release-release-melodic-multimaster_fkie-0.8.12-0"

inherit catkin
