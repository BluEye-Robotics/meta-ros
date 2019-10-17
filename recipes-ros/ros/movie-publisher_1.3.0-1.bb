DESCRIPTION = "Node for using a video file as video topic source."
AUTHOR = "Martin Pecka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "cv-bridge ffmpeg python3-imageio  rosbash-params rospy sensor-msgs"

SRC_URI = "https://github.com/peci1/movie_publisher-release/archive/release/melodic/movie_publisher/1.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "02decd74a325c5b5ce0964f468a476fc"
SRC_URI[sha256sum] = "d25ff36cadc9c0e22259a1e55b9e761efcc0e9ed0f4c1fcd30c1f919dfb90f4b"

S = "${WORKDIR}/movie_publisher-release-release-melodic-movie_publisher-1.3.0-1"

inherit catkin
