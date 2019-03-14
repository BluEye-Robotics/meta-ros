DESCRIPTION = "Uses opencv to find checkboards and compute their 6D poses with respect to the image. Requires the image to be calibrated."
AUTHOR = "Rosen Diankov (rdiankov@cs.cmu.edu)"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rosconsole dynamic-reconfigure cv-bridge sensor-msgs posedetection-msgs image-geometry jsk-recognition-msgs eigen-conversions message-filters tf tf2 roscpp dynamic-tf-publisher rosconsole dynamic-reconfigure cv-bridge sensor-msgs posedetection-msgs image-geometry jsk-recognition-msgs eigen-conversions message-filters tf tf2"

RDEPENDS_${PN} = "roscpp dynamic-tf-publisher rosconsole dynamic-reconfigure cv-bridge sensor-msgs posedetection-msgs image-geometry jsk-recognition-msgs eigen-conversions message-filters tf tf2"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/checkerboard_detector/1.2.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b2366cabcfdfcb58ddb67099501e2cd2"
SRC_URI[sha256sum] = "dd71dc333281545c1f557fa10e7bf1ebe2d08d3c2c388a7957e686bbc8b36b7c"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-checkerboard_detector-1.2.9-0"

inherit catkin
