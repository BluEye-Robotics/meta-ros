DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the om_with_tb3 with the MoveIt! Motion Planning Framework"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "open-manipulator-with-tb3-description"

RDEPENDS_${PN} = "moveit-ros-move-group moveit-fake-controller-manager moveit-kinematics moveit-planners-ompl moveit-ros-visualization moveit-setup-assistant joint-state-publisher robot-state-publisher xacro open-manipulator-with-tb3-description"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_with_tb3-release/archive/release/melodic/open_manipulator_with_tb3_waffle_pi_moveit/1.1.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7142a1127a80dd9e43b314e443988c7"
SRC_URI[sha256sum] = "64d1e46dbb348ebc614e922e5fd66f0a8086e36133c4212342b01aaa7a37da79"

ROS_SPN = "open_manipulator_with_tb3"
S = "${WORKDIR}/open_manipulator_with_tb3-release-release-melodic-open_manipulator_with_tb3_waffle_pi_moveit-1.1.0-2"

inherit catkin
