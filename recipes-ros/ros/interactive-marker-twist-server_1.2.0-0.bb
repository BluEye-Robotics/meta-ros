DESCRIPTION = "Interactive control for generic Twist-based robots using interactive markers"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "interactive-markers roscpp visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/interactive_marker_twist_server-release/archive/release/melodic/interactive_marker_twist_server/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "92a49608a84a6365362fc3b275084728"
SRC_URI[sha256sum] = "8597a128559ea347e15b06e235bb1124605e0060f42b3ceebe52769a75563946"

S = "${WORKDIR}/interactive_marker_twist_server-release-release-melodic-interactive_marker_twist_server-1.2.0-0"

inherit catkin
