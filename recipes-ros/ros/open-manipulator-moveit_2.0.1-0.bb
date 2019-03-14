DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the open_manipulator with the MoveIt! Motion Planning Framework"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "open-manipulator-description"

RDEPENDS_${PN} = "moveit-ros-move-group moveit-fake-controller-manager moveit-kinematics moveit-planners-ompl moveit-ros-visualization moveit-setup-assistant joint-state-publisher robot-state-publisher xacro open-manipulator-description"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_moveit/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1801b7a854cff744af3c946d559d881b"
SRC_URI[sha256sum] = "3c42db504d582107d35edba1019fc8764f4082573f47bfb41e53e89230d21488"

ROS_SPN = "open_manipulator"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_moveit-2.0.1-0"

inherit catkin
