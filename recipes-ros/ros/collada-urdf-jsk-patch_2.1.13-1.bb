DESCRIPTION = "unaccepted patch for collada_urdf"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "collada-parser collada-urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib rostest cmake-modules mk libgts git python3-catkin-tools collada-parser collada-urdf urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib libgts collada-urdf python3-catkin-tools"

RDEPENDS_${PN} = "collada-parser collada-urdf urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib libgts collada-urdf python3-catkin-tools"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/collada_urdf_jsk_patch/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "30e1fa199ee68df6fd9bf3f247656ef7"
SRC_URI[sha256sum] = "16a73a39a308022bf43861a645c408328c892b0ab1460b63a973910537fb49e0"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-collada_urdf_jsk_patch-2.1.13-1"

inherit catkin
