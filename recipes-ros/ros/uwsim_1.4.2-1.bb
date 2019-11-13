DESCRIPTION = "UWSim is an UnderWater SIMulator for marine robotics research and development. UWSim visualizes an underwater virtual scenario that can be configured using standard modeling software. Controllable underwater vehicles, surface vessels and robotic manipulators, as well as simulated sensors, can be added to the scene and accessed externally through ROS interfaces. This allows to easily integrate the visualization tool with existing control architectures."
AUTHOR = "Mario Prats"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "boost geometry-msgs image-transport interactive-markers kdl-parser libopenscenegraph libxml++-2.6 nav-msgs  osg-interactive-markers osg-markers osg-utils pcl-ros pluginlib resource-retriever robot-state-publisher roscpp sensor-msgs tf urdf underwater-sensor-msgs uwsim-bullet uwsim-osgbullet uwsim-osgocean uwsim-osgworks xacro dccomms-ros libxml++-2.6 muparser libopenscenegraph libfftw3 geographiclib geographiclib boost geometry-msgs image-transport interactive-markers kdl-parser libopenscenegraph libxml++-2.6 nav-msgs  osg-interactive-markers osg-markers osg-utils pcl-ros pluginlib resource-retriever robot-state-publisher roscpp sensor-msgs tf urdf underwater-sensor-msgs uwsim-bullet uwsim-osgbullet uwsim-osgocean uwsim-osgworks xacro dccomms-ros libxml++-2.6 muparser libopenscenegraph libfftw3 geographiclib geographiclib"

RDEPENDS_${PN} = "boost geometry-msgs image-transport interactive-markers kdl-parser libopenscenegraph libxml++-2.6 nav-msgs  osg-interactive-markers osg-markers osg-utils pcl-ros pluginlib resource-retriever robot-state-publisher roscpp sensor-msgs tf urdf underwater-sensor-msgs uwsim-bullet uwsim-osgbullet uwsim-osgocean uwsim-osgworks xacro dccomms-ros libxml++-2.6 muparser libopenscenegraph libfftw3 geographiclib geographiclib"

SRC_URI = "https://github.com/uji-ros-pkg/underwater_simulation-release/archive/release/melodic/uwsim/1.4.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a0e33fdec0b58e2fd8dd732bd55bb13e"
SRC_URI[sha256sum] = "eacb931f1b416310941e79904a304347f956d43b588fa5e1e3975875b875b77c"

ROS_SPN = "underwater_simulation"
S = "${WORKDIR}/underwater_simulation-release-release-melodic-uwsim-1.4.2-1"

inherit catkin
