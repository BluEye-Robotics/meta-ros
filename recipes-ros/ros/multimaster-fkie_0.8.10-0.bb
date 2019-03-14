DESCRIPTION = "The metapackage to combine the nodes required to establish and manage a multimaster network. This requires no or minimal configuration. The changes are automatically detected and synchronized."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multimaster-msgs-fkie default-cfg-fkie master-discovery-fkie master-sync-fkie node-manager-fkie"

RDEPENDS_${PN} = "multimaster-msgs-fkie default-cfg-fkie master-discovery-fkie master-sync-fkie node-manager-fkie"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/multimaster_fkie/0.8.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "19de7410c6ff3e442e9f36b2f76ce63a"
SRC_URI[sha256sum] = "7fa041261a218ef23fc6080700f61994990edfff46ed23e6c945c004965ce500"

S = "${WORKDIR}/multimaster_fkie-release-release-melodic-multimaster_fkie-0.8.10-0"

inherit catkin
