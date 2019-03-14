DESCRIPTION = "ROS packages for the turtlebot3 applications (meta package)"
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "turtlebot3-automatic-parking turtlebot3-automatic-parking-vision turtlebot3-follow-filter turtlebot3-follower turtlebot3-panorama"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_applications/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "daf98e118baa915a7d9cd9ceebd9b885"
SRC_URI[sha256sum] = "6a187830b2a3b3dc070e2ad870e5e17a471fa63318a305b188b13e35b9c5bd69"

S = "${WORKDIR}/turtlebot3_applications-release-release-melodic-turtlebot3_applications-1.1.0-0"

inherit catkin
