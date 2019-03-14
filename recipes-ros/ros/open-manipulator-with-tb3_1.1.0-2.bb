DESCRIPTION = "ROS-enabled OpenManipulator is a full open robot platform consisting of OpenSoftware​, OpenHardware and OpenCR(Embedded board)​. The OpenManipulator is allowed users to control it more easily by linking with the MoveIt! package. Moreover it has full hardware compatibility with TurtleBot3​. Even if you do not have a real robot, you can control the robot in the Gazebo simulator​."
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "open-manipulator-with-tb3-description open-manipulator-with-tb3-tools open-manipulator-with-tb3-waffle-moveit open-manipulator-with-tb3-waffle-pi-moveit"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_with_tb3-release/archive/release/melodic/open_manipulator_with_tb3/1.1.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "17e09978aba2ffebca13ed83da3fd6e6"
SRC_URI[sha256sum] = "92ac21aa5766a9a50f0d1db22e4585628d48d3e3fcafe7b397420e3e431ca3e2"

S = "${WORKDIR}/open_manipulator_with_tb3-release-release-melodic-open_manipulator_with_tb3-1.1.0-2"

inherit catkin
