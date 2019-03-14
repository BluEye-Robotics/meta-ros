DESCRIPTION = "Package for TurtleBot3 automatic_parking which uses ar code. This example needs a printed ar code and a TurtleBot3."
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "rospy std-msgs sensor-msgs geometry-msgs nav-msgs ar-track-alvar-msgs ar-track-alvar"

RDEPENDS_${PN} = "joint-state-publisher robot-state-publisher  turtlebot3-bringup"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_automatic_parking_vision/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c4bdde492a5546b2f54ab683b87f40ca"
SRC_URI[sha256sum] = "6e10d535cf4f41ac732ed8cc54edc197c35c8cf6969c2bf9b0649e37c97809ea"

ROS_SPN = "turtlebot3_applications"
S = "${WORKDIR}/turtlebot3_applications-release-release-melodic-turtlebot3_automatic_parking_vision-1.1.0-0"

inherit catkin
