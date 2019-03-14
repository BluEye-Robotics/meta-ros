DESCRIPTION = "The tools package(including SLAM, Navigation, Manipulation) for OpenManipulator with TurtleBot3"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "rospy roscpp roslaunch std-msgs geometry-msgs nav-msgs moveit-msgs trajectory-msgs open-manipulator-msgs ar-track-alvar-msgs moveit-core moveit-ros-planning moveit-ros-planning-interface smach smach-ros"

RDEPENDS_${PN} = "joint-state-publisher robot-state-publisher amcl map-server move-base"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_with_tb3-release/archive/release/melodic/open_manipulator_with_tb3_tools/1.1.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18f46fb7986e8705335ef99b55f0479d"
SRC_URI[sha256sum] = "6095647043adf0b59ecb69da2f441cbf996fa4729007040dbe2856d3d7341dab"

ROS_SPN = "open_manipulator_with_tb3"
S = "${WORKDIR}/open_manipulator_with_tb3-release-release-melodic-open_manipulator_with_tb3_tools-1.1.0-2"

inherit catkin
