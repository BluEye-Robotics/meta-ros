DESCRIPTION = "The teb_local_planner package implements a plugin to the base_local_planner of the 2D navigation stack. The underlying method called Timed Elastic Band locally optimizes the robot's trajectory with respect to trajectory execution time, separation from obstacles and compliance with kinodynamic constraints at runtime."
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules message-generation tf2-eigen tf2-geometry-msgs base-local-planner costmap-2d costmap-converter dynamic-reconfigure geometry-msgs interactive-markers libg2o nav-core nav-msgs mbf-costmap-core mbf-msgs pluginlib roscpp std-msgs tf2 tf2-ros visualization-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner-release/archive/release/melodic/teb_local_planner/0.8.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6071763b6ff3c62b8aaacde15f8341d2"
SRC_URI[sha256sum] = "7fe22efb10e905a9f2787049c7c826c33f2d3273b24e81c12d42812d7b07f7c6"

S = "${WORKDIR}/teb_local_planner-release-release-melodic-teb_local_planner-0.8.3-1"

inherit catkin
