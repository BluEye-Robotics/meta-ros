DESCRIPTION = "A Proxy Server for Interactive Markers"
AUTHOR = "David Gossow"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp message-generation interactive-markers visualization-msgs roscpp message-runtime interactive-markers visualization-msgs"

RDEPENDS_${PN} = "roscpp message-runtime interactive-markers visualization-msgs"

SRC_URI = "https://github.com/RobotWebTools-release/interactive_marker_proxy-release/archive/release/melodic/interactive_marker_proxy/0.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b23c09a8ed857d64b9d3a104780d391b"
SRC_URI[sha256sum] = "39123a492c42042c9566254a5342fa930f30cf26c0bc2279b83135477ef56bce"

S = "${WORKDIR}/interactive_marker_proxy-release-release-melodic-interactive_marker_proxy-0.1.2-0"

inherit catkin
