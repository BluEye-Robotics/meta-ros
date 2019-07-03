DESCRIPTION = "multisense_cal_check"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multisense-ros multisense-ros"

RDEPENDS_${PN} = "multisense-ros"

SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense_cal_check/4.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b321fe133c30d105b6c6f7d30269800e"
SRC_URI[sha256sum] = "465d464547103c39382ca3674e26c4babf375f44cc30f4c52b9e05c0f1c29532"

ROS_SPN = "multisense_ros"
S = "${WORKDIR}/multisense_ros-release-release-melodic-multisense_cal_check-4.0.2-0"

inherit catkin
