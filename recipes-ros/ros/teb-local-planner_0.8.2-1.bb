DESCRIPTION = "The teb_local_planner package implements a plugin to the base_local_planner of the 2D navigation stack. The underlying method called Timed Elastic Band locally optimizes the robot's trajectory with respect to trajectory execution time, separation from obstacles and compliance with kinodynamic constraints at runtime."
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules message-generation tf2-eigen tf2-geometry-msgs base-local-planner costmap-2d costmap-converter dynamic-reconfigure geometry-msgs interactive-markers libg2o nav-core nav-msgs pluginlib roscpp std-msgs tf2 tf2-ros visualization-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner-release/archive/release/melodic/teb_local_planner/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec8d1883dc23b713faecb0e512048098"
SRC_URI[sha256sum] = "a5b53799017164eb947798124f5fb2bfbe057e019b0239a587c0dd8bc80ab8a0"

S = "${WORKDIR}/teb_local_planner-release-release-melodic-teb_local_planner-0.8.2-1"

inherit catkin
