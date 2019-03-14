DESCRIPTION = "Convex Decomposition Tool for Robot Model"
AUTHOR = "John W. Ratcliff"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "unzip unzip"

RDEPENDS_${PN} = "unzip"

SRC_URI = "https://github.com/ros-gbp/convex_decomposition-release/archive/release/melodic/convex_decomposition/0.1.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a9a996fe8c73dd0c54807126ef869334"
SRC_URI[sha256sum] = "853e052839ccfe26f6ae8d94e157ad06cfa7c520c3fe12cf33783107caeee369"

S = "${WORKDIR}/convex_decomposition-release-release-melodic-convex_decomposition-0.1.12-0"

inherit catkin
