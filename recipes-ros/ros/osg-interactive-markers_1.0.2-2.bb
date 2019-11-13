DESCRIPTION = "This package is basically an OpenSceneGraph (OSG) adaptation of the Interactive Markers client writen for rviz/Ogre."
AUTHOR = "Mario Prats"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp libopenscenegraph visualization-msgs tf osg-utils osg-markers interactive-markers roscpp libopenscenegraph visualization-msgs tf osg-utils osg-markers interactive-markers"

RDEPENDS_${PN} = "roscpp libopenscenegraph visualization-msgs tf osg-utils osg-markers interactive-markers"

SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/melodic/osg_interactive_markers/1.0.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cb53cae52cc326408f94e997f2875e5e"
SRC_URI[sha256sum] = "44a8e53e5774686511ade483b0c58ad488edaa6abb7d14d889f61fa0671ed9ec"

ROS_SPN = "visualization_osg"
S = "${WORKDIR}/visualization_osg-release-release-melodic-osg_interactive_markers-1.0.2-2"

inherit catkin
