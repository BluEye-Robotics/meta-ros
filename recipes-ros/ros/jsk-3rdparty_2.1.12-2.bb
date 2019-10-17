DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "opt-camera rosping pgm-learner rospatlite nlopt voice-text slic assimp-devel ff mini-maxwell libcmt libsiftfast ffha downward rostwitter bayesian-belief-networks julius julius-ros"

RDEPENDS_${PN} = "opt-camera rosping pgm-learner rospatlite nlopt voice-text slic assimp-devel ff mini-maxwell libcmt libsiftfast ffha downward rostwitter bayesian-belief-networks julius julius-ros"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/jsk_3rdparty/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0b2b56541fb9aad01384a5346691913b"
SRC_URI[sha256sum] = "d637861c5f96cf1a35c6e2ffc89854a20fc21bdaa5cb64e2eeaddc698a7af246"

S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-jsk_3rdparty-2.1.12-2"

inherit catkin
