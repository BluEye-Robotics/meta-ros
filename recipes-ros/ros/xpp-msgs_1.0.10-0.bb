DESCRIPTION = "ROS messages used in the XPP framework."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-runtime message-generation std-msgs geometry-msgs sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_msgs/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "04fed7b332287caa5007f53f92b41c02"
SRC_URI[sha256sum] = "0835118248689817293f9399f3c3a7ece360dc9b6ac866ba80fa8c0c74554cd5"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_msgs-1.0.10-0"

inherit catkin
