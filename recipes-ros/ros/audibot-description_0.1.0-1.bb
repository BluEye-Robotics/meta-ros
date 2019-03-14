DESCRIPTION = "Meshes and URDF descriptions for audibot"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "urdf xacro"

SRC_URI = "https://github.com/robustify/audibot-release/archive/release/melodic/audibot_description/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "766a5c9ae5c88adc216105e45b444873"
SRC_URI[sha256sum] = "d3ed9cf90813e8be82fbad03f60acce1ab3cfe878343f6855a7d8619674e5c13"

ROS_SPN = "audibot"
S = "${WORKDIR}/audibot-release-release-melodic-audibot_description-0.1.0-1"

inherit catkin
