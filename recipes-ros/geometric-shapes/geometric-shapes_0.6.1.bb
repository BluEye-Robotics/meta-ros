DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost shape-msgs octomap assimp libeigen qhull console-bridge random-numbers eigen-stl-containers resource-retriever visualization-msgs"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6aa4662006bc8514251b0d41d8fc9f8b"
SRC_URI[sha256sum] = "768ecbd9bf8501a844b358026d6ae1db5d4d70d1958f47f5ca64c1ee7bd20b8c"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
