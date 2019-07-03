DESCRIPTION = "For every image, computes its sift features and send a new message with the image, its intrinsic parameters, and the features. Parameters include: display - shows the image on the local computer"
AUTHOR = "Rosen Diankov (rdiankov@cs.cmu.edu), Kei Okada"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "roscpp cmake-modules sensor-msgs posedetection-msgs image-transport jsk-recognition-utils jsk-topic-tools cv-bridge libsiftfast nodelet roscpp sensor-msgs posedetection-msgs image-transport jsk-recognition-utils cv-bridge libsiftfast nodelet jsk-topic-tools"

RDEPENDS_${PN} = "roscpp sensor-msgs posedetection-msgs image-transport jsk-recognition-utils cv-bridge libsiftfast nodelet jsk-topic-tools"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/imagesift/1.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf57606f67eb68d9977d3f4338b80097"
SRC_URI[sha256sum] = "322d64597608e08314224ee31b4fd32f1d3ab7fe3b6fea7cbff20131e411ffc5"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-imagesift-1.2.10-0"

inherit catkin
