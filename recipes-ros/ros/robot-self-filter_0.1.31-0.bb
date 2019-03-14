DESCRIPTION = "Filters the robot's body out of point clouds."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules roscpp tf filters sensor-msgs urdf bullet resource-retriever visualization-msgs pcl-ros assimp libtinyxml roscpp tf filters sensor-msgs urdf bullet resource-retriever visualization-msgs pcl-ros assimp libtinyxml"

RDEPENDS_${PN} = "roscpp tf filters sensor-msgs urdf bullet resource-retriever visualization-msgs pcl-ros assimp libtinyxml"

SRC_URI = "https://github.com/pr2-gbp/robot_self_filter-gbp/archive/release/melodic/robot_self_filter/0.1.31-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd707e61ac37a6ee225bc29b236aef3d"
SRC_URI[sha256sum] = "8a6538dd30770242d25476003332f8ac072fbb0837e50cdde55600dc7d063150"

S = "${WORKDIR}/robot_self_filter-gbp-release-melodic-robot_self_filter-0.1.31-0"

inherit catkin
