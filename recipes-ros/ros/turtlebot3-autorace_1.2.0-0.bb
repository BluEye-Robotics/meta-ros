DESCRIPTION = "AutoRace ROS packages for AutoRace with TurtleBot3 (meta package)"
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "turtlebot3-autorace-camera turtlebot3-autorace-control turtlebot3-autorace-core turtlebot3-autorace-detect"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_autorace-release/archive/release/melodic/turtlebot3_autorace/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd52d41c8bbd0ed90fd5519dec2620c2"
SRC_URI[sha256sum] = "1e9063e4da91e347177fe176cdcdea7510bd47e555bada4446679354de1b53ff"

S = "${WORKDIR}/turtlebot3_autorace-release-release-melodic-turtlebot3_autorace-1.2.0-0"

inherit catkin
