DESCRIPTION = "Gazebo configurations package for OpenManipulator"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs gazebo-ros gazebo-ros-control controller-manager xacro urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_simulations-release/archive/release/melodic/open_manipulator_gazebo/1.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "abdc69edd0209f9ed7d9f9ffdc11b967"
SRC_URI[sha256sum] = "1c5055d46fc7e08fce26a98cef9ca8bd79496f0e56aa44de49ff0c3e8675be84"

ROS_SPN = "open_manipulator_simulations"
S = "${WORKDIR}/open_manipulator_simulations-release-release-melodic-open_manipulator_gazebo-1.1.0-1"

inherit catkin
