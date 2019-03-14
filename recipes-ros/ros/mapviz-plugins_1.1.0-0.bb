DESCRIPTION = "Common plugins for the Mapviz visualization tool"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev actionlib cv-bridge gps-common image-transport mapviz marti-common-msgs marti-nav-msgs marti-visualization-msgs move-base-msgs nav-msgs map-msgs pluginlib roscpp sensor-msgs std-msgs stereo-msgs swri-image-util swri-math-util swri-route-util swri-transform-util swri-yaml-util tf visualization-msgs"

RDEPENDS_${PN} = "libqt-core libqt-opengl"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz_plugins/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fbb0116b89f8ef0c3c57f2509b1aa955"
SRC_URI[sha256sum] = "be044acba9267e5b7039c30a67b9acdf824e5c326a28fb1faa6a770646c9cb7e"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-mapviz_plugins-1.1.0-0"

inherit catkin
