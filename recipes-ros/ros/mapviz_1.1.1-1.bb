DESCRIPTION = "mapviz"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev message-generation cv-bridge  image-transport  libxi-dev libxmu-dev marti-common-msgs pluginlib rosapi roscpp rqt-gui-cpp rqt-gui std-srvs swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libqt-core libqt-opengl message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5fd957aca7fb59c3fa05d542f30b993d"
SRC_URI[sha256sum] = "cb5bd97bff1df54e81798494e2dc5e0bd6b12a51782a8855ed892c88aa8b5de7"

S = "${WORKDIR}/mapviz-release-release-melodic-mapviz-1.1.1-1"

inherit catkin
