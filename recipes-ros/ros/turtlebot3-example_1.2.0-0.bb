DESCRIPTION = "This package provides four TurtleBot3 basic example include move using interactive marker, move and stop using LDS, move to goal position, move to custom routes. The interactions node is that you can control the TurtleBot3 front and back side or rotate to goal position. The obstacle node is that when the robot meets an obstacle, it stops. The patrol node is that TurtleBot3 move to custom route. There are 3 route(square, triangle, circle) in this package. You can add your route and move the TurtleBot3. The pointop node is that you can insert goal position include distance x-axis, y-axis and angluar z-axis."
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation rospy actionlib interactive-markers std-msgs sensor-msgs geometry-msgs nav-msgs visualization-msgs actionlib-msgs turtlebot3-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime turtlebot3-bringup"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_example/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "00c6ceb760b723c8c0cf8c81cfc98225"
SRC_URI[sha256sum] = "bc0dbd753ed0334630a38db94dbb4cc73ecda965ad2f61843aa40cba93029feb"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_example-1.2.0-0"

inherit catkin
