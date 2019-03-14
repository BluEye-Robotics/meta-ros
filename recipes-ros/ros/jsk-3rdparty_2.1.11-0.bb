DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "opt-camera rosping pgm-learner rospatlite nlopt voice-text slic assimp-devel ff mini-maxwell libcmt libsiftfast ffha downward rostwitter bayesian-belief-networks julius julius-ros"

RDEPENDS_${PN} = "opt-camera rosping pgm-learner rospatlite nlopt voice-text slic assimp-devel ff mini-maxwell libcmt libsiftfast ffha downward rostwitter bayesian-belief-networks julius julius-ros"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/jsk_3rdparty/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ff9736aab10e6fef3f41c2bd374b361"
SRC_URI[sha256sum] = "211eb35dd9f68129faeccaf9657b6755248098584cc5c5970530ba8bc14bb6ad"

S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-jsk_3rdparty-2.1.11-0"

inherit catkin
