DESCRIPTION = "visualization_osg is a metapackage providing support for visualization of geometry using the OpenSceneGraph rendering engine."
AUTHOR = "Mario Prats"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "osg-utils osg-markers osg-interactive-markers"

RDEPENDS_${PN} = "osg-utils osg-markers osg-interactive-markers"

SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/melodic/visualization_osg/1.0.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "74e385d0a6ebb14b2fded290fedb467a"
SRC_URI[sha256sum] = "49cee62d712e9d538aaac8ce03c2222705074e11365f6c89d108dfb2decbf164"

S = "${WORKDIR}/visualization_osg-release-release-melodic-visualization_osg-1.0.2-2"

inherit catkin
