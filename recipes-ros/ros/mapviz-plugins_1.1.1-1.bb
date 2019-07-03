DESCRIPTION = "Common plugins for the Mapviz visualization tool"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev actionlib cv-bridge gps-common image-transport mapviz marti-common-msgs marti-nav-msgs marti-visualization-msgs move-base-msgs nav-msgs map-msgs pluginlib roscpp sensor-msgs std-msgs stereo-msgs swri-image-util swri-math-util swri-route-util swri-transform-util swri-yaml-util tf visualization-msgs"

RDEPENDS_${PN} = "libqt-core libqt-opengl"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/mapviz_plugins/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3ab4d51ea9eb7abc8e638def5f2bbd3a"
SRC_URI[sha256sum] = "76950b273f7c35ad6cf45ffaa49814193fa3cecd2f0da91ea176613545a17a5e"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-mapviz_plugins-1.1.1-1"

inherit catkin
