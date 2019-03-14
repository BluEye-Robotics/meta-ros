DESCRIPTION = "This provides a ROS node for the PR2 Power Board."
AUTHOR = "Curt Meyers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roscpp diagnostic-updater diagnostic-msgs pr2-msgs log4cxx message-runtime roscpp rospy diagnostic-updater diagnostic-msgs pr2-msgs log4cxx"

RDEPENDS_${PN} = "message-runtime roscpp rospy diagnostic-updater diagnostic-msgs pr2-msgs log4cxx"

SRC_URI = "https://github.com/pr2-gbp/pr2_power_drivers-release/archive/release/melodic/pr2_power_board/1.1.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7eaa9fce54c11075711d210108405f0c"
SRC_URI[sha256sum] = "9e6596dd8cdea88ca5abd93ecf2d567d34b89e97a4ffa32dbfdc8f001ce0cea9"

ROS_SPN = "pr2_power_drivers"
S = "${WORKDIR}/pr2_power_drivers-release-release-melodic-pr2_power_board-1.1.7-0"

inherit catkin
