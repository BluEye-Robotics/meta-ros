SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0fa981403d7cbee6911408ad4c5940a6"
SRC_URI[sha256sum] = "a6b470cf7ddc910d1adeaea8a586e2009e5ff12c23ddfca5fc6b1d8d8a06a788"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "velodyne"
