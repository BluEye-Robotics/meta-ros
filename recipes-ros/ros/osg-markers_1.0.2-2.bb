DESCRIPTION = "osg_markers can be used to create Markers geometry in OSG."
AUTHOR = "Mario Prats"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp libopenscenegraph visualization-msgs tf roslib roscpp libopenscenegraph visualization-msgs tf roslib"

RDEPENDS_${PN} = "roscpp libopenscenegraph visualization-msgs tf roslib"

SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/melodic/osg_markers/1.0.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ea13ef408efc54cac3a338268cc61fbb"
SRC_URI[sha256sum] = "173f82925c40381484abd5d53668fd56033792b15e66c5323a19f7c9ec3dc89d"

ROS_SPN = "visualization_osg"
S = "${WORKDIR}/visualization_osg-release-release-melodic-osg_markers-1.0.2-2"

inherit catkin
