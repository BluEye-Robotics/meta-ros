DESCRIPTION = "mapviz"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev message-generation cv-bridge  image-transport  libxi-dev libxmu-dev marti-common-msgs pluginlib rosapi roscpp rqt-gui-cpp rqt-gui std-srvs swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libqt-core libqt-opengl message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd2174433f810c298fa965feae1a30c7"
SRC_URI[sha256sum] = "f616f580f6f6712bc46043efb0a4fc6131a412504c23519d17074846c43cab8d"

S = "${WORKDIR}/mapviz-release-release-melodic-mapviz-1.1.0-0"

inherit catkin
