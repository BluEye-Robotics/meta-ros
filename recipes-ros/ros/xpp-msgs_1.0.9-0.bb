DESCRIPTION = "ROS messages used in the XPP framework."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-runtime message-generation std-msgs geometry-msgs sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_msgs/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6c6950c4b9a1e9abb0ec8229058c6e45"
SRC_URI[sha256sum] = "f3bf650f00f460d8a0897815d3a9b1afdcb86794055a36d691c13a5afb230c71"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_msgs-1.0.9-0"

inherit catkin
