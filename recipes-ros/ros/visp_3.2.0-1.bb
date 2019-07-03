DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross platform library that allows prototyping and developing applications using visual tracking and visual servoing technics at the heart of the researches done by Inria Lagadic team. ViSP is able to compute control laws that can be applied to robotic systems. It provides a set of visual features that can be tracked using real time image processing or computer vision algorithms. ViSP provides also simulation capabilities. ViSP can be useful in robotics, computer vision, augmented reality and computer animation."
AUTHOR = "Thomas Moulard, Fabien Spindler"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "doxygen opencv liblapack-dev libcoin80-dev libogre-dev libdc1394-dev libxml2 libjpeg libpng-dev bzip2 libx11-dev libv4l-dev libois-dev libdmtx-dev zbar libeigen opencv liblapack-dev libcoin80-dev libogre-dev libdc1394-dev libxml2 libjpeg libpng-dev bzip2 libx11-dev libv4l-dev libois-dev libdmtx-dev zbar libeigen"

RDEPENDS_${PN} = "opencv liblapack-dev libcoin80-dev libogre-dev libdc1394-dev libxml2 libjpeg libpng-dev bzip2 libx11-dev libv4l-dev libois-dev libdmtx-dev zbar libeigen"

SRC_URI = "https://github.com/lagadic/visp-release/archive/release/melodic/visp/3.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a15b6d28a6a07a62723b6fb7ebad57ec"
SRC_URI[sha256sum] = "346143452a134faec92f55373cdc2be7500a1e98c0c2b4a4459d7511adeea98c"

S = "${WORKDIR}/visp-release-release-melodic-visp-3.2.0-1"

inherit catkin
