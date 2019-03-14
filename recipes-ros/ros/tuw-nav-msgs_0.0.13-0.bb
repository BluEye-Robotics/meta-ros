DESCRIPTION = "The tuw_nav_msgs package"
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roscpp rospy std-msgs nav-msgs tf std-msgs geometry-msgs nav-msgs tuw-geometry-msgs"

RDEPENDS_${PN} = "message-runtime roscpp rospy std-msgs nav-msgs tf std-msgs geometry-msgs nav-msgs tuw-geometry-msgs"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_nav_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2cd316f87a8032656b58c3374b8e3245"
SRC_URI[sha256sum] = "6dd62f9b473be78c32bafb0b1f9c9410d2ed6f2b87586ce77f51e84f49132c39"

ROS_SPN = "tuw_msgs"
S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_nav_msgs-0.0.13-0"

inherit catkin
