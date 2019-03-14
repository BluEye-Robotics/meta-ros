DESCRIPTION = "publish end effector's force, which is estmated from joint torque value"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs sensor-msgs kdl-parser urdf tf-conversions geometry-msgs sensor-msgs kdl-parser urdf tf-conversions"

RDEPENDS_${PN} = "geometry-msgs sensor-msgs kdl-parser urdf tf-conversions"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/virtual_force_publisher/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d462e9eee73a6720846ab4fb36633796"
SRC_URI[sha256sum] = "12b7dd32a18a6b444d59d0dacd15781a6ea157a23924c04dc1aa7ca176de8a20"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-virtual_force_publisher-2.2.10-0"

inherit catkin
