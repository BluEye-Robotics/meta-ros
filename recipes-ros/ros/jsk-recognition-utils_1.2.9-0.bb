DESCRIPTION = "C++ library about sensor model, geometrical modeling and perception."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cython eigen-conversions dynamic-reconfigure geometry-msgs image-geometry jsk-recognition-msgs jsk-topic-tools pcl-msgs pcl-ros sensor-msgs std-msgs tf2-ros tf tf-conversions visualization-msgs yaml-cpp message-generation eigen-conversions geometry-msgs image-geometry jsk-recognition-msgs jsk-topic-tools pcl-msgs pcl-ros python-chainer-pip python-skimage sensor-msgs std-msgs tf2-ros tf-conversions tf visualization-msgs yaml-cpp message-runtime"

RDEPENDS_${PN} = "eigen-conversions geometry-msgs image-geometry jsk-recognition-msgs jsk-topic-tools pcl-msgs pcl-ros python-chainer-pip python-skimage sensor-msgs std-msgs tf2-ros tf-conversions tf visualization-msgs yaml-cpp message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_recognition_utils/1.2.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "849a8e1cb7597f5e61fc1f9f411ac8bc"
SRC_URI[sha256sum] = "26f543065023e9ec8b2545183563928e7b02a860209fd9661c5994a4fa577421"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_recognition_utils-1.2.9-0"

inherit catkin
