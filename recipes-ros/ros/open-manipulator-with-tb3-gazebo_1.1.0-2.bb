DESCRIPTION = "Simulation package using gazebo for OpenManipulator with TurtleBot3"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-ros gazebo-ros-control controller-manager xacro urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_with_tb3_simulations-release/archive/release/melodic/open_manipulator_with_tb3_gazebo/1.1.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "efc133f504e7dd5d4af2bfd9c13572d9"
SRC_URI[sha256sum] = "b78cf601ef185042b96bd253b246286853ed1a7d47f76c58f733f02213e64c5c"

ROS_SPN = "open_manipulator_with_tb3_simulations"
S = "${WORKDIR}/open_manipulator_with_tb3_simulations-release-release-melodic-open_manipulator_with_tb3_gazebo-1.1.0-2"

inherit catkin
