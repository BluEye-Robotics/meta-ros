DESCRIPTION = "AutoRace ROS packages for feature detection with TurtleBot3 Auto"
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "dynamic-reconfigure"

RDEPENDS_${PN} = "rospy std-msgs sensor-msgs geometry-msgs nav-msgs move-base-msgs tf cv-bridge  python-numpy python-enum34"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_autorace-release/archive/release/melodic/turtlebot3_autorace_detect/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "15845943e6cf1317ea1f8349e802dbfc"
SRC_URI[sha256sum] = "51d9465e570d60f2d1fe2500d9c9f285a801800c131f38fba376b0034eff3288"

ROS_SPN = "turtlebot3_autorace"
S = "${WORKDIR}/turtlebot3_autorace-release-release-melodic-turtlebot3_autorace_detect-1.2.0-0"

inherit catkin
