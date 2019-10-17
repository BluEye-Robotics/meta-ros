DESCRIPTION = "The turtlebot3_slam package provides roslaunch scripts for starting the SLAM"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp sensor-msgs"

RDEPENDS_${PN} = "turtlebot3-bringup"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_slam/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "17c5d83abdc2f24630f28a6ccded37c6"
SRC_URI[sha256sum] = "dd2f8644cf9019753493e5e080b06f28b097bd90e02669b859e708291ffcdb79"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_slam-1.2.0-0"

inherit catkin
