DESCRIPTION = "Parser for Semantic Robot Description Format (SRDF)."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules console-bridge urdf urdfdom-headers urdfdom-py libtinyxml boost console-bridge urdfdom-headers libtinyxml urdfdom-py"

RDEPENDS_${PN} = "boost console-bridge urdfdom-headers libtinyxml urdfdom-py"

SRC_URI = "https://github.com/ros-gbp/srdfdom-release/archive/release/melodic/srdfdom/0.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7d12c4159059d959949c610163bd4858"
SRC_URI[sha256sum] = "97b4cf0327af9082df3270024ceaa89d6b577bb2cbc09a5b19838557189e96f1"

S = "${WORKDIR}/srdfdom-release-release-melodic-srdfdom-0.5.1-0"

inherit catkin
