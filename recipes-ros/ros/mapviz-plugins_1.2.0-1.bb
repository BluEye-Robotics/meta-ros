DESCRIPTION = "Common plugins for the Mapviz visualization tool"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev actionlib cv-bridge gps-common image-transport mapviz marti-common-msgs marti-nav-msgs marti-visualization-msgs move-base-msgs nav-msgs map-msgs pluginlib roscpp sensor-msgs std-msgs stereo-msgs swri-image-util swri-math-util swri-route-util swri-transform-util swri-yaml-util tf visualization-msgs"

RDEPENDS_${PN} = "libqt-core libqt-opengl"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz_plugins/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3beff2d069c8d980046baf9c47d21506"
SRC_URI[sha256sum] = "4d2f34cf3d9e0f1a55afd8c48d112a80bd6174c7663164cc3abe19fd513b299c"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-mapviz_plugins-1.2.0-1"

inherit catkin
