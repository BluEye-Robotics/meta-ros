DESCRIPTION = "euscollada"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospack yaml-cpp assimp-devel urdf resource-retriever collada-dom collada-parser urdfdom qhull cmake-modules rosbuild rosboost-cfg tf mk collada-urdf rostest roscpp rospack yaml-cpp assimp-devel urdf urdfdom resource-retriever collada-dom collada-parser qhull tf collada-urdf rostest"

RDEPENDS_${PN} = "roscpp rospack yaml-cpp assimp-devel urdf urdfdom resource-retriever collada-dom collada-parser qhull tf collada-urdf rostest"

SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/melodic/euscollada/0.4.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "54a851573dcc8f5acd0af324f06d2bc8"
SRC_URI[sha256sum] = "0ef764eb030e00b1680f3ce353208fddcc1fa3850e4a7460231bd193573e00ba"

ROS_SPN = "jsk_model_tools"
S = "${WORKDIR}/jsk_model_tools-release-release-melodic-euscollada-0.4.3-0"

inherit catkin
