DESCRIPTION = "mapviz"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev message-generation cv-bridge  image-transport  libxi-dev libxmu-dev marti-common-msgs pluginlib rosapi roscpp rqt-gui-cpp rqt-gui std-srvs swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libqt-core libqt-opengl message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6f1785a042c35fc7860af14b1e6ba7df"
SRC_URI[sha256sum] = "162dc50cad75cb8d5125fad2c789494e5be659199b4b49747f92e75bd3ee73a2"

S = "${WORKDIR}/mapviz-release-release-melodic-mapviz-1.2.0-1"

inherit catkin
