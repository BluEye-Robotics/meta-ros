DESCRIPTION = "Contains the controllers that run in realtime on the PR2 and supporting packages."
AUTHOR = "Stuart Glaser sglaser@willowgarage.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-gripper-action pr2-calibration-controllers joint-trajectory-action ethercat-trigger-controllers robot-mechanism-controllers pr2-mechanism-controllers single-joint-position-action pr2-controllers-msgs pr2-head-action control-toolbox"

RDEPENDS_${PN} = "pr2-gripper-action pr2-calibration-controllers joint-trajectory-action ethercat-trigger-controllers robot-mechanism-controllers pr2-mechanism-controllers single-joint-position-action pr2-controllers-msgs pr2-head-action control-toolbox"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_controllers/1.10.17-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7e45a873e8fc2631d0a66bd645920270"
SRC_URI[sha256sum] = "4ca1b1f88af452339502ec5babb46695425d6247dc2eab2e08a787fc4155bace"

S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_controllers-1.10.17-1"

inherit catkin
