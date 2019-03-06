SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e59694af78de9c33f4cf2d0bfa5a6c2b"
SRC_URI[sha256sum] = "b39929a2ac912326fc114256e755fff5d0f0e5e5e7c99640d013eb7f916b85f4"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_tutorials"
