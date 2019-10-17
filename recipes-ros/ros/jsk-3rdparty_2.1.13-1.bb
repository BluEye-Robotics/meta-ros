DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "opt-camera rosping pgm-learner rospatlite nlopt voice-text slic assimp-devel ff mini-maxwell libcmt libsiftfast ffha downward rostwitter bayesian-belief-networks julius julius-ros"

RDEPENDS_${PN} = "opt-camera rosping pgm-learner rospatlite nlopt voice-text slic assimp-devel ff mini-maxwell libcmt libsiftfast ffha downward rostwitter bayesian-belief-networks julius julius-ros"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/jsk_3rdparty/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f30a15b9c753969ce66025fe418c7471"
SRC_URI[sha256sum] = "02d69f80483c89610e51bcdf01402a6197ab274a0af752f67903c602fad08650"

S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-jsk_3rdparty-2.1.13-1"

inherit catkin
