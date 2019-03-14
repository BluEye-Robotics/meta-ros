DESCRIPTION = "octovis is visualization tool for the OctoMap library based on Qt and libQGLViewer. See http://octomap. github. io for details."
AUTHOR = "Kai M. Wurm"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "octomap libqglviewer-qt4-dev libqt4-dev libqt4-opengl-dev catkin octomap libqglviewer-qt4 libqtgui4 libqt4-opengl"

RDEPENDS_${PN} = "catkin octomap libqglviewer-qt4 libqtgui4 libqt4-opengl"

SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/melodic/octovis/1.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f8cf9f457cc619905308c4278e1c217d"
SRC_URI[sha256sum] = "3edf836edd904daf7f76b13dad10d4094e37a5a8c5829193fe1b583e62f2c8ef"

ROS_SPN = "octomap"
S = "${WORKDIR}/octomap-release-release-melodic-octovis-1.9.0-1"

inherit catkin
