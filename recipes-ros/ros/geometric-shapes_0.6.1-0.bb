DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost libeigen eigen-stl-containers console-bridge qhull octomap pkgconfig random-numbers resource-retriever shape-msgs visualization-msgs assimp boost libeigen eigen-stl-containers console-bridge qhull octomap random-numbers resource-retriever shape-msgs visualization-msgs"

RDEPENDS_${PN} = "assimp boost libeigen eigen-stl-containers console-bridge qhull octomap random-numbers resource-retriever shape-msgs visualization-msgs"

SRC_URI = "https://github.com/ros-gbp/geometric_shapes-release/archive/release/melodic/geometric_shapes/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6e468e145b14354ce0d002af37be80f2"
SRC_URI[sha256sum] = "d30facbce2033851ba0b121a75c8d41c47a91831e51efb11dafe3bc877a50809"

S = "${WORKDIR}/geometric_shapes-release-release-melodic-geometric_shapes-0.6.1-0"

inherit catkin
